import javax.swing.*;

public class ProyectoParqueadero {

     public static void main (String[] args) {

          String nombre;
          String placa;
          int vehiculo;
          int carro=1;
          int moto=2;
          double horaentrada,salida,resta,mult;


          JOptionPane.showMessageDialog(null,"parqueadero plata o plomo \n"  +
                  "valor hora o fraccion \n" +
                  "carro: 2000______________moto: 1000\n");



          nombre = JOptionPane.showInputDialog("ingrese su nombre");

          placa = JOptionPane.showInputDialog("ingrese la placa de su vehiculo");

          horaentrada = Double.parseDouble(JOptionPane.showInputDialog("ingrese la hora de entrada del vehiculo"));


         JOptionPane.showMessageDialog(null,"el nombre del cliente es: " + nombre + "\n" +
                                                                   "la placa del vehiculo es: " + placa + "\n"+
                                                    "la hora de entrada del vehiculo fue: " +horaentrada+"\n");


         JOptionPane.showMessageDialog(null,"parqueadero plata o plomo \n"  +
                 "valor hora o fraccion \n" +
                 "carro: 2000______________moto: 1000\n" + "el nombre del cliente es: " + nombre + "\n" +
                 "la placa del vehiculo es: " + placa + "\n"+
                 "la hora de entrada del vehiculo fue: " +horaentrada+"\n");




         salida = Double.parseDouble(JOptionPane.showInputDialog("ingrese la hora de salida"));
         resta = salida-horaentrada;

         vehiculo = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 si su vehiculo es carro o 2 si es moto"));

         /*if (vehiculo==carro)
         {
             mult = Math.ceil(resta) * 2000;

             JOptionPane.showMessageDialog(null, "parqueadero plata o plomo \n" +
                     "valor hora o fraccion \n" +
                     "carro: 2000______________moto: 1000\n" + "el nombre del cliente es: " + nombre + "\n" +
                     "la placa del vehiculo es: " + placa + "\n" +
                     "la hora de entrada del vehiculo fue: " + horaentrada + "\n" +
                     "lahora de salida es: " + salida + "\n" +
                     "el valor a pagar es: " + mult + "\n");
         }
         else {
             mult = Math.ceil(resta)*1000;
             JOptionPane.showMessageDialog(null, "parqueadero plata o plomo \n" +
                     "valor hora o fraccion \n" +
                     "carro: 2000______________moto: 1000\n" + "el nombre del cliente es: " + nombre + "\n" +
                     "la placa del vehiculo es: " + placa + "\n" +
                     "la hora de entrada del vehiculo fue: " + horaentrada + "\n" +
                     "lahora de salida es: " + salida + "\n" +
                     "el valor a pagar es: " + mult + "\n");
         }*/
         switch (vehiculo) {
             case 1:mult = Math.ceil(resta) * 2000;

                 JOptionPane.showMessageDialog(null, "parqueadero plata o plomo \n" +
                         "valor hora o fraccion \n" +
                         "carro: 2000______________moto: 1000\n" + "el nombre del cliente es: " + nombre + "\n" +
                         "la placa del vehiculo es: " + placa + "\n" +
                         "la hora de entrada del vehiculo fue: " + horaentrada + "\n" +
                         "lahora de salida es: " + salida + "\n" +
                         "el valor a pagar es: $" + mult + "\n");
                 break;
             case 2: mult = Math.ceil(resta) * 1000;
                 JOptionPane.showMessageDialog(null, "parqueadero plata o plomo \n" +
                         "valor hora o fraccion \n" +
                         "carro: 2000______________moto: 1000\n" + "el nombre del cliente es: " + nombre + "\n" +
                         "la placa del vehiculo es: " + placa + "\n" +
                         "la hora de entrada del vehiculo fue: " + horaentrada + "\n" +
                         "lahora de salida es: " + salida + "\n" +
                         "el valor a pagar es: $" + mult + "\n");
                 break;
             default : JOptionPane.showMessageDialog(null, "numero que ingreso no es valido");
         }
         }
     }

