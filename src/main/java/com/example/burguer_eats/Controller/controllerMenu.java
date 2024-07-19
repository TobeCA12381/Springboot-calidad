/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.example.burguer_eats.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
/**import com.example.burguer_eats.Models.Menu.Promociones;
import java.util.ArrayList;
import java.util.List;**/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**import org.springframework.ui.Model;**/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**import org.springframework.web.bind.annotation.RequestMapping;**/
import org.springframework.web.servlet.ModelAndView;

import com.example.burguer_eats.Clases.Cliente;
import com.example.burguer_eats.Interfaces.IClienteService;

/**
 *
 * @author Jaramillo
 */

@Controller
/**
 * @RequestMapping("/Menu")*
 */
public class controllerMenu {
    /**
     * 
     * public List<Promociones> getPromociones(){
     * ArrayList<Promociones> promociones = new ArrayList<>();
     * 
     * promociones.add((new Promociones(1, "s/24.30",
     * "http://localhost:9090/PROMOCION 1", "Hola", "Trio Patriotico")));
     * promociones.add((new Promociones(2, "s/24.30",
     * "http://localhost:9090/PROMOCION 1", "Hola", "Trio Patriotico")));
     * promociones.add((new Promociones(3, "s/24.30",
     * "http://localhost:9090/PROMOCION 1", "Hola", "Trio Patriotico")));
     * return promociones;
     * }
     * 
     * 
     * 
     * @GetMapping(path = {"/promociones", "/"})
     *                  public String menu(Model model) {
     *                  model.addAttribute("promociones", this.getPromociones());
     *                  return "Menu";
     *                  }
     * 
     * 
     * 
     */

    @GetMapping("/")
    public ModelAndView getMenu() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Menu");
        return modelAndView;
    }

    @Controller
    public class ClienteController {
        @Autowired
        private IClienteService service;

        @Autowired
        private PasswordEncoder passwordEncoder;

        @PostMapping("/registrarCliente")
        public String Registrar(@RequestParam("nom") String nom,
                @RequestParam("ape") String ape,
                @RequestParam("dni") String dni,
                @RequestParam("cel") String cel,
                @RequestParam("email") String email,
                @RequestParam("dir") String dir,
                @RequestParam("pass") String pass,
                Model model) {

            Cliente cliente = new Cliente();

            cliente.setNombre(nom);
            cliente.setApellido(ape);
            cliente.setDni(dni);
            cliente.setCelular(cel);
            cliente.setEmail(email);
            cliente.setDireccion(dir);
            cliente.setContraseña(passwordEncoder.encode(pass));
            service.Guardar(cliente);
            return "inicio";
        }
    }

    @Controller
    public class LoginController {
        @Autowired
        private IClienteService service;

        @Autowired
        private PasswordEncoder passwordEncoder;

        @PostMapping("/inicioSesion")
        public String Registrar(@RequestParam("correo") String correo,
                @RequestParam("password") String password,
                Model model) {

            Cliente cliente = new Cliente();

            cliente = service.BuscarPorEmail(correo);
            if (cliente != null) {
                if (passwordEncoder.matches(password, cliente.getContraseña())) {
                    System.out.println("Contraseña correcta");
                    return "Menu";
                } else {
                    System.out.println("Contraseña incorrecta");
                    return "inicio";
                }
            }      
            return "inicio";
        }
    }
    
    @Controller
    public class MenuController {

        @GetMapping("/menu")
        public ModelAndView getMenu() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("Menu");
            return modelAndView;
        }
    }
    

    @Controller
    public class NosotrosController {

        @GetMapping("/nosotros")
        public ModelAndView getNosotros() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("Nosotros");
            return modelAndView;
        }
    }

    @Controller
    public class ContactanosController {

        @GetMapping("/contactanos")
        public ModelAndView getContactanos() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("Contactanos");
            return modelAndView;
        }
    }

    @Controller
    public class ZonasDeRepartoController {

        @GetMapping("/zonasDeReparto")
        public ModelAndView getZonasDeReparto() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("ZonasDeReparto");
            return modelAndView;
        }
    }

    @Controller
    public class IndexController {

        @GetMapping("/index")
        public ModelAndView getIndex() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("index");
            return modelAndView;
        }
    }

    @Controller
    public class PagoController {

        @GetMapping("/Pago")
        public ModelAndView getPago() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("Pago");
            return modelAndView;
        }
    }

    @Controller
    public class inicioController {

        @GetMapping("/inicio")
        public ModelAndView getInicio() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("inicio");
            return modelAndView;
        }
    }

    @Controller
    public class UserController {

        @GetMapping("/AddUser")
        public ModelAndView getAddUser() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("AddUser");
            return modelAndView;
        }
    }

    @Controller
    public class ForoController {

        @GetMapping("/Foro")
        public ModelAndView getForo() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("Foro");
            return modelAndView;
        }
    }

    @Controller
    public class PlatoController {

        @GetMapping("/Plato")
        public ModelAndView getPlato() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("Plato");
            return modelAndView;
        }
    }

    @Controller
    public class calendarioController {

        @GetMapping("/calendario")
        public ModelAndView getCalendario() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("calendario");
            return modelAndView;
        }
    }

    @Controller
    public class configController {

        @GetMapping("/config")
        public ModelAndView getConfig() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("config");
            return modelAndView;
        }
    }

    @Controller
    public class pedidosController {

        @GetMapping("/pedidos")
        public ModelAndView getPedidos() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("pedidos");
            return modelAndView;
        }
    }

    @Controller
    public class registroController {

        @GetMapping("/registros")
        public ModelAndView getRegistro() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("registro");
            return modelAndView;
        }
    }

    @Controller
    public class reporteController {

        @GetMapping("/reporte")
        public ModelAndView getReporte() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("reporte");
            return modelAndView;
        }
    }

}
