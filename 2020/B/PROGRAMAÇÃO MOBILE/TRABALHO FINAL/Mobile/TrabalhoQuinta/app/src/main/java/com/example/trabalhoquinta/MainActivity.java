package com.example.trabalhoquinta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText etLogin = null;
    private EditText etSenha = null;

    private TextView tvError = null;

    private Button btEntrar = null;
    private Button btRegistrar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_params();

    }

    public void init_params() {
        etLogin = findViewById(R.id.edit_text_usuario);
        etSenha = findViewById(R.id.edit_text_senha);
        tvError = findViewById(R.id.text_view_error);
        btEntrar = findViewById(R.id.button_entrar);
        btRegistrar = findViewById(R.id.button_registrar);

        btEntrar.setOnClickListener(v -> realizarLogin());
        btRegistrar.setOnClickListener(v -> chamarTelaRegistro());
    }

    public void realizarLogin() {
        String login = etLogin.getText().toString();
        String senha = etSenha.getText().toString();

        HashMap<String, String> params = new HashMap<>();
        params.put("senha", senha);
        params.put("login", login);
        params.put("id", "0");
        String json = new Gson().toJson(params);

        enviarDadosDeLogin(json);
    }

    public void enviarDadosDeLogin(String json) {
        String url = "http://177.44.248.82:8080/RealizarLogin/webresources/login";

        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest putRequest = new StringRequest(
                Request.Method.PUT,
                url,
                response -> {
                    boolean respostaBoolean = Boolean.parseBoolean(response.toString());
                    if(respostaBoolean) {
                        tvError.setText("");
                        chamarTelaPesquisa();
                    } else {
                        tvError.setText("Usuário ou senha inválidos." + "Não foi possível realizar login. ");
                    }
                },
                error -> {
                    tvError.setText("Erro de conexão com servidor");
                }
        ) {
            @Override
            public byte[] getBody() {
                return json.getBytes();
            }

            @Override
            public String getBodyContentType() {
                return "application/json; charset=utf-8";
            }

            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json; charset=utf-8");
                return headers;
            }
        };
        queue.add(putRequest);
    }

    public void chamarTelaRegistro() {
        Intent intent = new Intent(this, RegistrarActivity.class);
        startActivity(intent);
    }

    public void chamarTelaPesquisa() {
        Intent intent = new Intent(this, PesquisaActivity.class);
        startActivity(intent);
    }
}