import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int atributo1=0;
    	int atributo2=0;
    	int atributo3=0;
    	int atributo4=0;
    	int index;
    	int numeroDeIntentos=0, vecesGanadas = 0;

    	Scanner pregunta = new Scanner(System.in);
		System.out.println("Dame el nombre de Usuario: ");
		String Usuario = pregunta.nextLine();
		
    	while(true){

    		System.out.println("1.-Si quieres Jugar ");
    		System.out.println("2.-Si quieres Salir ");
    		String q = pregunta.nextLine();	
    		int question=Integer.parseInt(q);

    		if(question==2) {
    			break;
    		}
    		if(question==1) {

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Alice", "Bob", "Jose", "David", "Emily", "Frank", "Grace", "Henry", "Isa", "James"));

        ArrayList<Persona1> personas = new ArrayList<Persona1>();

        for (int i = 0; i < 10; i++) {
            index = new Random().nextInt(nombres.size());
            String nombre = nombres.get(index);
            personas.add(new Persona1(nombre));
            nombres.remove(index);
        }
        
        Random rand = new Random();
        index = rand.nextInt(personas.size());
        Persona1 personaAleatoria = personas.get(index);

        for (Persona1 persona : personas) {
        	if(persona.tieneAtributo1()) {
        		atributo1++;
        	}
        	if(persona.tieneAtributo2()) {
        		atributo2++;
        	}
        	if(persona.tieneAtributo3()) {
        		atributo3++;
        	}
        	if(persona.tieneAtributo4()) {
        		atributo4++;
        	}
        }
        for (Persona1 persona : personas) {
        	int t=0;
            for (Persona1 persona1 : personas) {
            	if(persona.tieneAtributo1()==persona1.tieneAtributo1()) {
            		t++;
            	}if(persona.tieneAtributo2()==persona1.tieneAtributo2()) {
            		t++;
            	}if(persona.tieneAtributo3()==persona1.tieneAtributo3()) {
            		t++;
            	}if(persona.tieneAtributo4()==persona1.tieneAtributo4()) {
            		t++;
            	}
            }
            if(t==4) {
            	persona.setAtributo1(!(persona.tieneAtributo1()));
            	persona.setAtributo2(!(persona.tieneAtributo2()));
            	persona.setAtributo3(!(persona.tieneAtributo3()));
            	persona.setAtributo4(!(persona.tieneAtributo4()));

            	continue;
            }
        }
        
        if(atributo2<2) {
        	for (Persona1 persona : personas) {
                if (!persona.tieneAtributo2()) {
                    persona.setAtributo2(true);
                    atributo2++;
                    if (atributo2 == 2) {
                        break;
                    }
                }
        	}
        }
        if(atributo3<2) {
        	for (Persona1 persona : personas) {
                if (!persona.tieneAtributo3()) {
                    persona.setAtributo3(true);
                    atributo3++;
                    if (atributo3 == 2) {
                        break;
                    }
                }
        	}
        }
        if(atributo4<2) {
        	for (Persona1 persona : personas) {
                if (!persona.tieneAtributo4()) {
                    persona.setAtributo4(true);
                    atributo1++;
                    if (atributo4 == 2) {
                        break;
                    }
                }
        	}
        }
        if(atributo1<2) {
        	for (Persona1 persona : personas) {
                if (!persona.tieneAtributo1()) {
                    persona.setAtributo1(true);
                    atributo1++;
                    if (atributo1 == 2) {
                        break;
                    }
                }
        	}
        }
        for(Persona1 persona : personas) {
        	
        }
        for (Persona1 persona : personas) {
            System.out.println(persona.getNombre() + ": \tTiene cabello:" +persona.tieneAtributo1() + ". \tTiene  Barba: " + persona.tieneAtributo2()+ ". \tTiene mascota(s): " + persona.tieneAtributo3()+ ". \tTiene Ojos Verdes:" + persona.tieneAtributo4()+"\n");
            }
        System.out.println(atributo1+" Tienen Pelo");
        System.out.println(atributo2+" Tienen Barba");
        System.out.println(atributo3+" Tiene mascota(s)");
        System.out.println(atributo4+" Tienen los ojos Verdes");

        System.out.println("\n\nJugemos Adivina Quien!!!");
        System.out.println("Elige entre estas 4 preguntas y adivina quien.");
        System.out.println("\n\n1.-\t¿Tu personaje tiene pelo?");
        System.out.println("2.-\t¿Tu personaje tiene barba?");
        System.out.println("3.-\t¿Tu personaje tiene mascota?");
        System.out.println("4.-\t¿Tu personaje tiene los ojos verdes?");
        
        	
		for(int g=0; g<3;g++) {

        Scanner opciones = new Scanner(System.in);
		System.out.println("\n¿Que pregunta quieres hacer 1, 2, 3 o 4?");
		String n = opciones.nextLine();
		int option=Integer.parseInt(n);
		
		switch(option) {
    		case 1:
    			if(personaAleatoria.tieneAtributo1()) {
    				System.out.println("El personaje si tiene pelo");
    			}
    			else {
    				System.out.println("El personaje no tiene pelo");
    			}
    			for(Persona1 persona : personas) {
    				
    				if(persona.tieneAtributo1()!= personaAleatoria.tieneAtributo1()) {
    		            System.out.println(persona.eliminado());    					
    					continue;
    				}    	
    		            System.out.println(persona);
        				
    			}
    			
    			break;
    			
    		case 2:
    			if(personaAleatoria.tieneAtributo2()) {
    				System.out.println("El personaje si tiene barba");
    			}
    			else {
    				System.out.println("El personaje no tiene barba");
    			}
    			for(Persona1 persona : personas) {
    				
    				if(persona.tieneAtributo2()!= personaAleatoria.tieneAtributo2()) {
    		            System.out.println(persona.eliminado());    					
    					continue;
    				}    	
    		            System.out.println(persona);
        				
    			}			
    			break;
    			
    		case 3:
    			if(personaAleatoria.tieneAtributo3()) {
    				System.out.println("El personaje si tiene mascota");
    			}
    			else {
    				System.out.println("El personaje no tiene mascota");
    			}
    			for(Persona1 persona : personas) {
    				
    				if(persona.tieneAtributo3()!= personaAleatoria.tieneAtributo3()) {
    		            System.out.println(persona.eliminado());    					
    					continue;
    				}    	
    		            System.out.println(persona);
        				
    			}
    			break;
    			
    		case 4:
    			if(personaAleatoria.tieneAtributo4()) {
    				System.out.println("El personaje si tiene ojos verdes");
    			}
    			else {
    				System.out.println("El personaje no tiene ojos verdes");
    			}
    			for(Persona1 persona : personas) {
    				
    				if(persona.tieneAtributo4()!= personaAleatoria.tieneAtributo4()) {
    		            System.out.println(persona.eliminado());    					
    					continue;
    				}    	
    		            System.out.println(persona);
        				
    			}
    			break;
    		
            }
        }     
		
		System.out.println("Ahora que ya tienes todas las pistas \n¿Quien es el personaje?");
		String r = pregunta.nextLine();
		if(personaAleatoria.getNombre().equals(r)) {
			System.out.println("Correcto, adivinaste a la persona");
			vecesGanadas++;
		}
		else {
			System.out.println("Noooo!!!, la persona era: "+personaAleatoria.getNombre() );
		}
    
    	numeroDeIntentos++;
    	}
    }
    	System.out.println("Jugador: "+Usuario+"\nNumero de Intentos: "+numeroDeIntentos+"/nNumero de veces ganadas: "+ vecesGanadas);
    	
    }
}