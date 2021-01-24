package innerclass33;

public class Company {//outera class
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {//ini adalah contoh innerclass(class didalam class)
        String name;

        public String getCompany(){
            //cara mengambil member dari outer class company didalam inner class
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
