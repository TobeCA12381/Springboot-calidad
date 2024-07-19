package com.example.burguer_eats.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlerImage {
    @GetMapping("/logo")
    public ResponseEntity<byte[]> getImage1() throws IOException {
        // Obtener la ruta de la imagen
        String image1Path = "src/main/resources/static/img/Logo.png";

        // Leer la imagen del disco
        byte[] image1Bytes = Files.readAllBytes(Paths.get(image1Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image1Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/carrusel1")
    public ResponseEntity<byte[]> getImage2() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/carrusel1.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    
    @GetMapping("/admin")
    public ResponseEntity<byte[]> getImage3() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/admin.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/angelo")
    public ResponseEntity<byte[]> getImage4() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/angelo.jpeg";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/Barquillonas")
    public ResponseEntity<byte[]> getImage5() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Barquillonas - Precio 9.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/burgereats")
    public ResponseEntity<byte[]> getImage6() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/burgereats.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/burguer3")
    public ResponseEntity<byte[]> getImage8() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/burguer3.avif";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

     @GetMapping("/cafe")
    public ResponseEntity<byte[]> getImage7() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/cafe.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/camion")
    public ResponseEntity<byte[]> getImage9() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/camion.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/carrito")
    public ResponseEntity<byte[]> getImage10() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/carrito.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/carrito1")
    public ResponseEntity<byte[]> getImage11() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/carrito1.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/carrusel2")
    public ResponseEntity<byte[]> getImage12() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/carrusel2.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/carrusel3")
    public ResponseEntity<byte[]> getImage13() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/carrusel3.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/carrusel4")
    public ResponseEntity<byte[]> getImage14() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/carrusel4.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/CIELO")
    public ResponseEntity<byte[]> getImage15() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/CIELO SIN GAS 520 ML - Precio 2.50_1.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/cliente")
    public ResponseEntity<byte[]> getImage16() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/cliente.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/COCA COLA")
    public ResponseEntity<byte[]> getImage17() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/COCA COLA 500 ML - Precio 3.20.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/COCA COLA SIN AZUCAR")
    public ResponseEntity<byte[]> getImage18() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/COCA COLA SIN AZUCAR 500 ML - Precio 3.50.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/Copas")
    public ResponseEntity<byte[]> getImage19() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Copas GeloCr3am - Precio 15.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/Copix Crem")
    public ResponseEntity<byte[]> getImage20() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Copix Crem - Precio 5.00_1.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/Empanadas de Jamon y Queso")
    public ResponseEntity<byte[]> getImage21() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Empanadas de Jamon y Queso - Precio 4.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/fondo")
    public ResponseEntity<byte[]> getImage22() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/fondo.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/FANTA")
    public ResponseEntity<byte[]> getImage23() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/FANTA 500 ML - Precio 3.20.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/FANTA PIÑA")
    public ResponseEntity<byte[]> getImage24() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/FANTA PIÑA 500 ML - Precio 3.50_1.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/fondo1")
    public ResponseEntity<byte[]> getImage25() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/fondo1.jpg";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/Fresua")
    public ResponseEntity<byte[]> getImage26() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Fresua - Precio 6.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/gabriel")
    public ResponseEntity<byte[]> getImage27() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/gabriel.jpeg";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/hamburguesa")
    public ResponseEntity<byte[]> getImage28() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/hamburguesa.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }


    @GetMapping("/INKA KOLA")
    public ResponseEntity<byte[]> getImage29() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/INKA KOLA 500 ML - Precio 3.20.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/INKA KOLA SIN AZUCAR")
    public ResponseEntity<byte[]> getImage30() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/INKA KOLA SIN AZUCAR 500 ML - Precio 3.50.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/izi")
    public ResponseEntity<byte[]> getImage31() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/izi.jpg";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/jara")
    public ResponseEntity<byte[]> getImage32() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/jara.jpeg";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }


    @GetMapping("/La Doblex Tocino")
    public ResponseEntity<byte[]> getImage33() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/La Doblex Tocino - Precio 12.30.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/La Inclinxda")
    public ResponseEntity<byte[]> getImage34() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/La Inclinxda - Precio 16.99.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/La Krixpi")
    public ResponseEntity<byte[]> getImage35() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/La Krixpi - Precio 10.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/La Patriota")
    public ResponseEntity<byte[]> getImage36() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/La Patriota - Precio 14.63.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/La Poderoza")
    public ResponseEntity<byte[]> getImage37() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/La Poderoza - Precio 11.89.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/La Quebradora")
    public ResponseEntity<byte[]> getImage38() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/La Quebradora - Precio 12.69.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    
    @GetMapping("/Le Clasique")
    public ResponseEntity<byte[]> getImage39() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Le Clasique - Precio 13.85.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/LOA AGUA DE MEZA")
    public ResponseEntity<byte[]> getImage40() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/LOA AGUA DE MEZA 540 ML - Precio 2.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/NGK Papas Chicas")
    public ResponseEntity<byte[]> getImage41() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/NGK Papas Chicas - Precio 3.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/Nuggets 10 Unidades")
    public ResponseEntity<byte[]> getImage42() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Nuggets 10 Unidades - Precio 9.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/Nuggets Porcion Grande")
    public ResponseEntity<byte[]> getImage43() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Nuggets Porcion Grande - Precio 18.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/ola")
    public ResponseEntity<byte[]> getImage44() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/ola.jpg";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/Papas Fritas Grandes")
    public ResponseEntity<byte[]> getImage45() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/Papas Fritas Grandes - Precio 6.00.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

     @GetMapping("/PROMOCION 1")
    public ResponseEntity<byte[]> getImage46() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/PROMOCION 1.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/PROMOCION 2")
    public ResponseEntity<byte[]> getImage47() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/PROMOCION 2.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/PROMOCION 3")
    public ResponseEntity<byte[]> getImage48() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/PROMOCION 3.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/PROMOCION 4")
    public ResponseEntity<byte[]> getImage49() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/PROMOCION 4.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/prueba")
    public ResponseEntity<byte[]> getImage50() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/prueba.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/SAN LUIS SIN GAS")
    public ResponseEntity<byte[]> getImage51() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/SAN LUIS SIN GAS 625 ML - PRECIO 2.40.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/The Gourtmen")
    public ResponseEntity<byte[]> getImage52() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/The Gourtmen - Precio 12.99.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/The king Black")
    public ResponseEntity<byte[]> getImage53() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/The king Black - Precio 22.90.png";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }

    @GetMapping("/uwu")
    public ResponseEntity<byte[]> getImage54() throws IOException {
        // Obtener la ruta de la imagen
        String image2Path = "src/main/resources/static/img/uwu.jpg";

        // Leer la imagen del disco
        byte[] image2Bytes = Files.readAllBytes(Paths.get(image2Path));

        // Establecer el encabezado de la respuesta
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        // Crear la respuesta
        return new ResponseEntity<>(image2Bytes, headers, HttpStatus.OK);
    }
}
