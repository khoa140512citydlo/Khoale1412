package ex7_1;

public class Customer {
    private String name;
    private String memberType;

    public Customer(String name, String memberType) {
        this.name = name;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public boolean isMember() {
        return !memberType.equals("Normal");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
