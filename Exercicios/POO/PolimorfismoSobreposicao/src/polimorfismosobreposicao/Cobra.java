package polimorfismosobreposicao;

public class Cobra extends Reptil{
 
 @Override
 public void alimentar(){
     System.out.println("Engolindo presa");
 }
 
 @Override
 public void emitirSom(){
     System.out.println("Som de Cobra");
 }
}
