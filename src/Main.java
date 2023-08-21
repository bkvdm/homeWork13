public class Main {

    public static void bookInformation(String title, Author author, int yearPublishing) {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author.getWriterFirstName() + " " + author.getWriterMiddleName());
        System.out.println("Год издания: " + yearPublishing);
    }

    public static void main(String[] args) {
        int yearReissue = 2023;
        Author authorOne = new Author("Рождественский", "Роберт");
        Author authorTwo = new Author("Симонов", "Константин");
        Author authorThree = new Author("Твардовский", "Александр");
        Book bookOne = new Book("Человеку надо мало", 1973, authorOne);
        Book bookTwo = new Book("Жди меня, и я вернусь", 1942, authorTwo);
        Book bookTree = new Book("О Родине",1942, authorThree);
        bookOne.setYearPublishing(yearReissue);
        bookTwo.setYearPublishing(yearReissue);
        bookTree.setYearPublishing(yearReissue);
        System.out.println("Перечень произведений:");
        bookInformation(bookOne.getTitle(), bookOne.getAuthor(), bookOne.getYearPublishing());
        bookInformation(bookTwo.getTitle(), bookTwo.getAuthor(), bookTwo.getYearPublishing());
        bookInformation(bookTree.getTitle(), bookTree.getAuthor(), bookTree.getYearPublishing());
        System.out.println("С использованием метода toString:");
        System.out.println("bookOne.toString() = " + bookOne.toString());
        System.out.println("bookTwo.toString() = " + bookTwo.toString());
        System.out.println("bookTree.toString() = " + bookTree.toString());
        System.out.println("Пример использование метода equals:");
        System.out.println("bookOne.getTitle().equals(bookTwo.getTitle()) = " + bookOne.getTitle().equals(bookTwo.getTitle()));
        System.out.println("bookOne.getAuthor().equals(bookTree.getAuthor()) = " + bookOne.getAuthor().equals(bookTree.getAuthor()));
        System.out.println("bookTree.getAuthor().equals(bookTree.getAuthor()) = " + bookTree.getAuthor().equals(bookTree.getAuthor()));
        System.out.println("bookOne.equals(bookTwo) = " + bookOne.equals(bookTwo));
        System.out.println("bookTwo.equals(bookTwo) = " + bookTwo.equals(bookTwo));
    }
}