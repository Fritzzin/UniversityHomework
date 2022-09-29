using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebApplicationTeste.Models;

namespace WebApplicationTeste.Controllers
{
    public class UsuariosController : Controller
    {
        public IActionResult Index()
        {
            DbConContext context = HttpContext.RequestServices.GetService(typeof(WebApplicationTeste.Models.DbConContext)) as DbConContext;

            return View(context.GetAllusuarios());
        }

        public IActionResult Create()
        {
            DbConContext context = HttpContext.RequestServices.GetService(typeof(WebApplicationTeste.Models.DbConContext)) as DbConContext;

            return View();
        }

        public ActionResult Insert(usuarios model)
        {

            usuarios us = new usuarios();
            us.Id = model.Id;
            us.Nome = model.Nome;
            

            DbConContext context = HttpContext.RequestServices.GetService(typeof(WebApplicationTeste.Models.DbConContext)) as DbConContext;

            context.InsertUser(us);


            return RedirectToAction("Index");
        }

    }
}
