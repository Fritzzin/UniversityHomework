using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace WebApplicationTeste.Models
{
    public class DbConContext
    {
        public string ConnectionString { get; set; }

        public DbConContext(string connectionString)
        {
            this.ConnectionString = connectionString;
        }

        private MySqlConnection GetConnection()
        {
            return new MySqlConnection(ConnectionString);
        }

        public List<usuarios> GetAllusuarios()
        {
            List<usuarios> list = new List<usuarios>();

            using (MySqlConnection conn = GetConnection())
            {
                conn.Open();
                MySqlCommand cmd = new MySqlCommand("select * from usuarios", conn);

                using (var reader = cmd.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        list.Add(new usuarios()
                        {
                            Id = Convert.ToInt32(reader["Id"]),
                            Nome = reader["Nome"].ToString(),
                        });
                    }
                }
            }
            return list;
        }

        public Boolean InsertUser(usuarios model)
        {
            MySqlConnection conn = GetConnection();
            conn.Open();
            MySqlCommand cmd = new MySqlCommand("INSERT INTO usuarios VALUES ("+model.Id+", '"+model.Nome+"')", conn);
            cmd.ExecuteNonQuery();
            
            return true;
        }
    }

    
}
