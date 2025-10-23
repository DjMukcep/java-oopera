import person.Actor;
import person.Director;
import person.Gender;
import show.*;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor(Gender.MALE, "Jesse", "Heiman", 183);
        Actor actor2 = new Actor(Gender.MALE, "Leonardo", "DiCaprio", 184);
        Actor actor3 = new Actor(Gender.FEMALE, "Scarlett", "Johansson", 185);

        Director director1 = new Director(Gender.MALE, "Christopher", "Nolan", 20);
        Director director2 = new Director(Gender.MALE, "Denis", "Villeneuve", 15);

        Show play = new Play("Romeo and Juliet", 160, director1);
        MusicalShow opera = new Opera("Carmen", 180, director2,
                "Jorge Bizet", "opera libretto", 40);
        MusicalShow ballet = new Ballet("The Nutcracker", 100, director2,
                "Pyotr Ilyich Tchaikovsky",
                "balet libretto", "Marius Petipa");

        // добавляем актеров
        play.addActor(actor1);
        play.addActor(actor2);
        play.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        System.out.println();

        // Проверки на дублирование, null, на отсутствие актера для замены.
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
