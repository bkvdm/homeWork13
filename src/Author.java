import java.util.Objects;

public class Author {

    private String writerFirstName;
    private String writerMiddleName;

    public Author(String writerFirstName, String writerMiddleName) {
        this.writerFirstName = writerFirstName;
        this.writerMiddleName = writerMiddleName;
    }

    public String getWriterFirstName() {
        return writerFirstName;
    }

    public String getWriterMiddleName() {
        return writerMiddleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(writerFirstName, author.writerFirstName) && Objects.equals(writerMiddleName, author.writerMiddleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writerFirstName, writerMiddleName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "writerFirstName='" + writerFirstName + '\'' +
                ", writerMiddleName='" + writerMiddleName + '\'' +
                '}';
    }
}
