package com.generation.f20220530;

import com.generation.f20220527.Alumno;

public class NewThang {

	public static void main(String[] args) {
		//~~~~~~~< Marysabel >~~~~~~~
		//   ~~~~~~~< Aedo >~~~~~~~
		//    ~~~~~~~< 18 >~~~~~~~
		//    ~~~~~~~< G1 >~~~~~~~
		
        Alumno alumno01 = new Alumno("Luis","Mejias",28,"G1");
        Alumno alumno02 = new Alumno("Leonardo","Utreras",26,"G1");
        Alumno alumno03 = new Alumno("Mary","Aedo",18,"G1");
        Alumno alumno04 = new Alumno("Francisco","Perez",26,"G1");
        Alumno alumno05 = new Alumno("Francisco","Cid",25,"G1");
        Alumno alumno06 = new Alumno("Ignacio","Romero",23,"G1");
        
        System.out.println(alumno03.getNombre()+ " " + alumno03.getApellido()+ " " + alumno03.getEdad()+" " + alumno03.getCurso());



    }

}
