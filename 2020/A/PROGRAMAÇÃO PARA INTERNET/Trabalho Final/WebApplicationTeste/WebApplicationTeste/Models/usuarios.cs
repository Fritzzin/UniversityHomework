using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplicationTeste.Models
{
    public class usuarios
    {
        private DbConContext context;

        public int Id { get; set; }

        public string Nome { get; set; }
    }
}
