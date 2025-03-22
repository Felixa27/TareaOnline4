package com.mycompany.hotel;

import com.mycompany.hotel.objetos.ClienteFMSR;
import com.mycompany.hotel.objetos.EmpleadoFMSR;
import com.mycompany.hotel.objetos.HabitacionFMSR;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelFMSR {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<ClienteFMSR> listaClientes = new ArrayList<>();
        ArrayList<EmpleadoFMSR> listaEmpleados = new ArrayList<>();
        ArrayList<HabitacionFMSR> listaHabitaciones = new ArrayList<>();

        int opcion;

        do {
            mostrarMenu();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> registrarCliente(teclado, listaClientes);
                case 2 -> eliminarClienteId(teclado, listaClientes);
                case 3 -> registrarEmpleado(teclado, listaEmpleados);
                case 4 -> eliminarEmpleadoId(teclado, listaEmpleados);
                case 5 -> registrarHabitacion(teclado, listaHabitaciones);
                case 6 -> eliminarHabitacionId(teclado, listaHabitaciones);
                case 7 -> mostrarClientes(listaClientes);
                case 8 -> mostrarEmpleados(listaEmpleados);
                case 9 -> mostrarHabitaciones(listaHabitaciones);
                case 10 -> System.out.println("Cerrando el programa...");
                default -> System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }

    private static void mostrarMenu() {
        System.out.println("1. Registrar cliente.");
        System.out.println("2. Dar de baja a un cliente.");
        System.out.println("3. Registrar empleado.");
        System.out.println("4. Dar de baja a un empleado.");
        System.out.println("5. Agregar nueva habitación.");
        System.out.println("6. Eliminar una habitación.");
        System.out.println("7. Mostrar todos los clientes.");
        System.out.println("8. Mostrar todos los empleados.");
        System.out.println("9. Mostrar todas las habitaciones.");
        System.out.println("10. Salir del programa.");
        System.out.print("Introduce el número de la opción deseada: ");
    }

    private static void mostrarClientes(ArrayList<ClienteFMSR> listaClientes) {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            for (ClienteFMSR cliente : listaClientes) {
                System.out.println("ID: " + cliente.getIdCliente());
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Apellidos: " + cliente.getApellidos());
                System.out.println("DNI: " + cliente.getDNI());
                System.out.println("Número de teléfono: " + cliente.getNumeroTelefono());
                System.out.println();
            }
        }
    }

    private static void mostrarEmpleados(ArrayList<EmpleadoFMSR> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar...");
        } else {
            for (EmpleadoFMSR empleado : listaEmpleados) {
                System.out.println("ID: " + empleado.getIdEmpleado());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellidos: " + empleado.getApellidos());
                System.out.println("DNI: " + empleado.getDNI());
                System.out.println("Número de teléfono: " + empleado.getNumeroTelefono());
                System.out.println();
            }
        }
    }

    private static void mostrarHabitaciones(ArrayList<HabitacionFMSR> listaHabitaciones) {
        if (listaHabitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {
            for (HabitacionFMSR habitacion : listaHabitaciones) {
                System.out.println("ID: " + habitacion.getIdHabitacion());
                System.out.println("Tipo: " + habitacion.getTipo());
                System.out.println("Número de camas: " + habitacion.getNumeroCamas());
                System.out.println("Coste por día: " + habitacion.getCostePorDia());
                System.out.println();
            }
        }
    }

    private static void registrarCliente(Scanner teclado, ArrayList<ClienteFMSR> listaClientes) {
        System.out.println("Introduzca el ID del nuevo cliente: ");
        int idCliente = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        String apellidos = teclado.nextLine();
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        String dni = teclado.nextLine();
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        int telefono = teclado.nextInt();
        teclado.nextLine();

        ClienteFMSR cliente = new ClienteFMSR(idCliente, nombre, apellidos, dni, telefono);
        listaClientes.add(cliente);
        System.out.println("Cliente registrado correctamente.");
    }

    private static void eliminarClienteId(Scanner teclado, ArrayList<ClienteFMSR> listaClientes) {
        System.out.println("Introduzca el ID del cliente a eliminar: ");
        int idCliente = teclado.nextInt();
        teclado.nextLine();

        ClienteFMSR clienteAEliminar = null;
        for (ClienteFMSR cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente) {
                clienteAEliminar = cliente;
                break;
            }
        }

        if (clienteAEliminar != null) {
            listaClientes.remove(clienteAEliminar);
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void registrarEmpleado(Scanner teclado, ArrayList<EmpleadoFMSR> listaEmpleados) {
        System.out.println("Introduzca el ID del nuevo empleado: ");
        int idEmpleado = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el nombre del nuevo empleado: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        String apellidos = teclado.nextLine();
        System.out.println("Introduzca el DNI del nuevo empleado: ");
        String dni = teclado.nextLine();
        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        int telefono = teclado.nextInt();
        teclado.nextLine();

        EmpleadoFMSR empleado = new EmpleadoFMSR(idEmpleado, nombre, apellidos, dni, telefono);
        listaEmpleados.add(empleado);
        System.out.println("Empleado registrado correctamente.");
    }

    private static void eliminarEmpleadoId(Scanner teclado, ArrayList<EmpleadoFMSR> listaEmpleados) {
        System.out.println("Introduzca el ID del empleado a eliminar: ");
        int idEmpleado = teclado.nextInt();
        teclado.nextLine();

        EmpleadoFMSR empleadoAEliminar = null;
        for (EmpleadoFMSR empleado : listaEmpleados) {
            if (empleado.getIdEmpleado() == idEmpleado) {
                empleadoAEliminar = empleado;
                break;
            }
        }

        if (empleadoAEliminar != null) {
            listaEmpleados.remove(empleadoAEliminar);
            System.out.println("Empleado eliminado correctamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private static void registrarHabitacion(Scanner teclado, ArrayList<HabitacionFMSR> listaHabitaciones) {
        System.out.println("Introduzca el ID de la nueva habitación: ");
        int idHabitacion = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el tipo de la nueva habitación: ");
        String tipo = teclado.nextLine();
        System.out.println("Introduzca el número de camas de la nueva habitación: ");
        int camas = teclado.nextInt();
        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        double coste = teclado.nextDouble();
        teclado.nextLine();

        HabitacionFMSR habitacion = new HabitacionFMSR(idHabitacion, tipo, camas, coste);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitación registrada correctamente.");
    }

    private static void eliminarHabitacionId(Scanner teclado, ArrayList<HabitacionFMSR> listaHabitaciones) {
        System.out.println("Introduzca el ID de la habitación a eliminar: ");
        int idHabitacion = teclado.nextInt();
        teclado.nextLine();

        HabitacionFMSR habitacionAEliminar = null;
        for (HabitacionFMSR habitacion : listaHabitaciones) {
            if (habitacion.getIdHabitacion() == idHabitacion) {
                habitacionAEliminar = habitacion;
                break;
            }
        }

        if (habitacionAEliminar != null) {
            listaHabitaciones.remove(habitacionAEliminar);
            System.out.println("Habitación eliminada correctamente.");
        } else {
            System.out.println("Habitación no encontrada.");
        }
    }
}
