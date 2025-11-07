import person.*;
import show.*;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor(Gender.MALE, "Jesse", "Heiman", 183);
        Actor actor2 = new Actor(Gender.MALE, "Leonardo", "DiCaprio", 184);
        Actor actor3 = new Actor(Gender.FEMALE, "Scarlett", "Johansson", 185);

        Person musicAuthor1 = new Person(Gender.MALE,"Jorge","Bizet");
        Person musicAuthor2 = new Person(Gender.MALE,"Pyotr","Tchaikovsky");

        Person choreographer = new Person(Gender.MALE,"Marius","Petipa");

        Director director1 = new Director(Gender.MALE, "Christopher", "Nolan", 20);
        Director director2 = new Director(Gender.MALE, "Denis", "Villeneuve", 15);

        Show play = new Play("Romeo and Juliet", 160, director1);

        MusicalShow opera = new Opera(
                "Carmen",
                180, director2,
                musicAuthor1,
                "opera libretto",
                40);

        MusicalShow ballet = new Ballet(
                "The Nutcracker",
                100, director2,
                musicAuthor2,
                "ballet libretto",
                choreographer);

        // добавляем актеров
        System.out.println();
        play.addActor(actor1);
        play.addActor(actor2);
        play.addActor(actor3);

        System.out.println();
        opera.addActor(actor1);
        opera.addActor(actor3);

        System.out.println();
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        System.out.println();

        // Проверки на дублирование, null, на отсутствие актера с такой фамилией.
        ballet.addActor(actor2);
        ballet.addActor(null);
        ballet.changeActor("Johansson", actor1);
        System.out.println();

        // выводим списки в консоль
        ballet.printActors();
        System.out.println();

        play.printActors();
        System.out.println();

        opera.printActors();
        System.out.println();
        opera.changeActor("Heiman", actor2);
        System.out.println();
        opera.printActors(); // проверка замены элемента

        System.out.println();
        opera.printLibretto();
        ballet.printLibretto();

        System.out.println();
        ballet.printDirector();
    }
}
