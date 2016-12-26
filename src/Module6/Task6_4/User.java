package Module6.Task6_4;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (user.getId() == id &&
                user.getFirstName().equalsIgnoreCase(firstName) &&
                user.getLastName().equalsIgnoreCase(lastName) &&
                user.getSalary() == salary &&
                user.getBalance() == balance) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() throws NullPointerException{
        try {
            int result = (int) (id ^ (id >>> 32));
            result = 31 * result + firstName.hashCode();
            result = 31 * result + lastName.hashCode();
            result = 31 * result + salary;
            result = 31 * result + balance;
            return result;
        } catch (NullPointerException e) {
            System.out.println("Warning: User with id = " + id + " has first name or last name equal to null");
        }
        return -1;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
