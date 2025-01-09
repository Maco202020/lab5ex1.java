public class PerecheNumere {
    private int a;
    private int b;

    public PerecheNumere() {}
    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }


    public boolean Consecutive() {
        if(a == b - 1 || a == b + 1) {
            return true;
        }
        else return false;
    }

    public int cmmdc() {
        int a = this.a;
        int b = this.b;
        while(a != b) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    public boolean SumaCifrelorEgala() {
        int sumaCifreA = 0;
        int sumaCifreB = 0;
        int a = this.a;
        int b = this.b;
        while(a != 0) {
            sumaCifreA += a % 10;
            a = a / 10;
        }
        while(b != 0) {
            sumaCifreB += b % 10;
            b = b / 10;
        }
        if(sumaCifreA == sumaCifreB) {
            return true;
        }
        else return false;
    }

    public boolean NumarCifrePareEgale() {
        int nrCifreA = 0;
        int nrCifreB = 0;
        int a = this.a;
        int b = this.b;
        while(a != 0) {
            if((a % 10) % 2 == 0) {
                nrCifreA++;
            }
            a = a / 10;
        }
        while(b != 0) {
            if((b % 10) % 2 == 0) {
                nrCifreB++;
            }
            b = b / 10;
        }
        if(nrCifreA == nrCifreB) {
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "PerecheNumere :"+ "a=" + a + " " + "b=" + b ;
    }
}
