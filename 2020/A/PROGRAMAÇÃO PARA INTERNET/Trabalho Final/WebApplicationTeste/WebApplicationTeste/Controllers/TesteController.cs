using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace WebApplicationTeste.Controllers
{
    // /Teste
    public class TesteController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
