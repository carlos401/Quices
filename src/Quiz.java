/**
 * Solución del quiz #1
 * @author Carlos Delgado
 */

public class Quiz {

    public double getY(int p){
        double result = 1;
        for (int i=0;i<p;i++) {
            result*=(i%2==0)?1:i;
        }
        return result;
    }

    public int getZ(int p, int i){
        int result = 0;
        int iter;
        do{
            iter=0;
            int f=i;
            while(i>0){
                iter+=f;
                i--;
            }
            result+=iter;
        } while (result<=p);
        return result;
    }

    public String getDiagnostico(double peso, double estatura){
        double IMC = peso/(estatura*estatura);
        if(IMC < 18.5)
            return "Peso insuficiente";
        else if(IMC < 24.9){
            return "Peso normal";
        } else if (IMC < 26.9){
            return "Sobrepeso grado 1";
        } else if (IMC < 29.9){
            return "Sobrepeso grado 2";
        } else if (IMC < 34.9){
            return "Obesidad tipo 1";
        } else if (IMC < 39.9){
            return "Obesidad tipo 2";
        } else if (IMC < 49.9){
            return "Obesidad tipo 3";
        } else {
            return "Obesidad tipo 4";
        }
    }

    public static void main(String[] args){
        Quiz quiz = new Quiz();
        System.out.println(quiz.getY(10));
        System.out.println(quiz.getZ(2,5));
        System.out.println(quiz.getDiagnostico(65,1.60));
    }
}

