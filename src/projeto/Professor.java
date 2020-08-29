package projeto;

public class Professor extends Person {
    private String salary;
    private String filiation;
    private String federation;

    public Professor(
        String name,
        String birth,
        String graduation,
        String cpf,
        String street,
        String neighbour,
        String city,
        String zip,
        String number,
        String complement,
        String email,
        String phone,
        Boolean isWhatsapp,
        String gender,
        String category,
        String weight,
        String height,
        int code,
        String salary,
        String filiation,
        String federation
        ){
        super(
            name,
            birth,
            graduation,
            cpf,
            street,
            neighbour,
            city,
            zip,
            number,
            complement,
            email,
            phone,
            isWhatsapp,
            gender,
            category,
            weight,
            height,
            code
        );
        this.salary = salary;
        this.filiation = filiation;
        this.federation = federation;
    }

    public String getSalary(){
        return this.salary;
    }

    public void setSalary(String newSalary){
        this.salary = newSalary;
    }

    public String getFiliation(){
        return this.filiation;
    }

    public void setFiliation(String newFiliation){
        this.filiation = newFiliation;
    }

    public String getFederation(){
        return this.federation;
    }

    public void setFederation(String newFederation){
        this.federation = newFederation;
    }

}