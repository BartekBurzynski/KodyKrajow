public class Country {
    private String id;
    private String name;
    private int people;

    public Country(String id, String name, int people) {
        this.id = id;
        this.name = name;
        this.people = people;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (people != country.people) return false;
        if (!id.equals(country.id)) return false;
        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + people;
        return result;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + people;
    }
}
