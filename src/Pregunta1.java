public class Pregunta1 {
    public static void main(String[] args) {
        String diaDeVenta = "Sabado";
        String articulo = "Cargador";
        int respuesta1 = precioVenta(articulo, diaDeVenta);
        double respuesta2 = precioVentaConDescuento(articulo, diaDeVenta);
        double respuesta3 = precioVentaConDescuentoMasIgv(articulo, diaDeVenta);
        double respuesta3alternativa = respuesta2 * 1.18;


        System.out.println("El precio de venta sin desceunto ni IGV es: " + respuesta1);
        System.out.println("El valor del descuento es: " + descuento(diaDeVenta)); //Respuesta 2
        System.out.println("El precio con Total mas IGV es: " + respuesta3alternativa); //Respuesta 3
    }
    public static double descuento(String diaVenta){
        double valorDescuento = 0.0;
        if (diaVenta == "Domingo"|| diaVenta=="Sabado") {
            valorDescuento = 0.10;
        }
            else valorDescuento = 0.05;
        return valorDescuento;
    }
    public static int precioVenta(String accesorio, String diaVenta) { //Respuesta 1
        int precio = 0;
        if (accesorio == "Mica") {
            //instruccion 1
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 20;
            else precio = 30;
        } else if (accesorio == "Cargador") {
            //instruccion 2
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 25;
            else precio = 40;
        } else if (accesorio == "Protector") {
            //instruccion 3
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 35;
            else precio = 50;
        }
        return precio;
    }

    public static double precioVentaConDescuento(String accesorio, String diaVenta) { //Respuesta 2
        double precio = 0;
        if (accesorio == "Mica") {
            //instruccion 1
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 20;
            else precio = 30;
        } else if (accesorio == "Cargador") {
            //instruccion 2
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 25;
            else precio = 40;
        } else if (accesorio == "Protector") {
            //instruccion 3
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 35;
            else precio = 50;
        }

        if (diaVenta == "Sabado" || diaVenta == "Domingo") precio = precio * 0.9;
        else precio = precio * 0.95;

        return precio;
    }

    public static double precioVentaConDescuentoMasIgv(String accesorio, String diaVenta) { //Respuesta 3
        double precio = 0;
        if (accesorio == "Mica") {
            //instruccion 1
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 20;
            else precio = 30;
        } else if (accesorio == "Cargador") {
            //instruccion 2
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 25;
            else precio = 40;
        } else if (accesorio == "Protector") {
            //instruccion 3
            if (diaVenta == "Lunes" || diaVenta == "Martes" || diaVenta == "Miercoles" || diaVenta == "Jueves")
                precio = 35;
            else precio = 50;
        }

        if (diaVenta == "Sabado" || diaVenta == "Domingo") precio = precio * 0.9;
        else precio = precio * 0.95;
        precio = precio * 1.18;
        return precio;
    }







}
