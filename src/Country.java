public class Country {
    private String Id;
    private String name;
    private int people;

    public Country(String id, String name, int people) {
        Id = id;
        this.name = name;
        this.people = people;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
        if (!Id.equals(country.Id)) return false;
        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        int result = Id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + people;
        return result;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + people;
    }
}
