package services;

import java.util.ArrayList;
import java.util.Arrays;
import models.Album;

public class InicializadorAlbumes {

    public static ArrayList<Album> inicializarAlbumes() {

        // Inicializar canciones para cada álbum
        ArrayList<String> cancionesAlbum1 = new ArrayList<>();
        cancionesAlbum1.addAll(Arrays.asList("Tim McGraw", "Picture to Burn", "Teardrops on My Guitar",
                "A place in This World", "Cold as You", "The Outside", "Tied Together with a Smile", "Stay Beautiful",
                "Should've Said No", "Mary's Song", "Our Song"));

        ArrayList<String> cancionesAlbum2 = new ArrayList<>();
        cancionesAlbum2.addAll(Arrays.asList("Fearless", "Fifteen", "Love Story", "Hey Stephen", "White Horse",
                "You Belong with Me", "Breathe", "Tell Me Why", "You're Not Sorry", "The Way I Loved You",
                "Forever & Always", "The Best Day", "Change", "Jump Then Fall", "Untouchable", "Forever & Always",
                "Come in with the Rain", "Superstar", "The Other Side of the Door", "Today Was a Fairytale",
                "You All Over Me", "Mr. Perfectly Fine", "We Were Happy", "That's When", "Don't You", "Bye Bye Baby"));

        ArrayList<String> cancionesAlbum3 = new ArrayList<>();
        cancionesAlbum3.addAll(Arrays.asList("Mine", "Sparks Fly", "Back to December", "Speak Now", "Dear John", "Mean",
                "The Story of Us", "Never Grow Up", "Enchanted", "Better than Revenge", "Innocent", "Haunted",
                "Last Kiss", "Long Live"));

        ArrayList<String> cancionesAlbum4 = new ArrayList<>();
        cancionesAlbum4.addAll(Arrays.asList("State of Grace", "Red", "Treacherous", "I Knew You Were Trouble",
                "All Too Well", "22", "I Almost Do", "We Are Never Ever Getting Back Together", "Stay Stay Stay",
                "The Last Time", "Holy Ground", "Sad Beautiful Tragic", "The Lucky One", "Everything Has Changed",
                "Starlight", "Begin Again"));

        ArrayList<String> cancionesAlbum5 = new ArrayList<>();
        cancionesAlbum5.addAll(Arrays.asList("Welcome to New York", "Blank Space", "Style", "Out of the Woods",
                "All You Had to Do Was Stay", "Shake It Off", "I Wish You Would", "Bad Blood", "Wildest Dreams",
                "How You Get the Girl", "This Love", "I Know Places", "Clean"));

        ArrayList<String> cancionesAlbum6 = new ArrayList<>();
        cancionesAlbum6.addAll(Arrays.asList("...Ready for It?", "End Game", "I Did Something Bad", "Don't Blame Me",
                "Delicate", "Look What You Made Me Do", "So It Goes...", "Gorgeous", "Getaway Car", "King of My Heart",
                "Dancing with Our Hands Tied", "Dress", "This Is Why We Can't Have Nice Things",
                "Call It What You Want", "New Year's Day"));

        ArrayList<String> cancionesAlbum7 = new ArrayList<>();
        cancionesAlbum7.addAll(Arrays.asList("Cruel Summer", "Lover", "The Man", "The Archer", "I Think He Knows",
                "Miss Americana & the Heartbreak Prince", "Paper Rings", "Cornelia Street", "Death by a Thousand Cuts",
                "London Boy", "Soon You'll Get Better", "False God", "You Need to Calm Down", "Afterglow", "Me!",
                "It's Nice to Have a Friend", "Daylight"));

        ArrayList<String> cancionesAlbum8 = new ArrayList<>();
        cancionesAlbum8.addAll(Arrays.asList("The 1", "Cardigan", "The Last Great American Dynasty", "Exile",
                "My Tears Ricochet", "Mirrorball", "Seven", "August", "This Is Me Trying", "Illicit Affairs",
                "Invisible String", "Mad Woman", "Epiphany", "Betty", "Peace", "Hoax"));

        ArrayList<String> cancionesAlbum9 = new ArrayList<>();
        cancionesAlbum9.addAll(Arrays.asList("Willow", "Champagne Problems", "Gold Rush", "'Tis the Damn Season",
                "Tolerate It", "No Body, No Crime", "Happiness", "Dorothea", "Coney Island", "Ivy", "Cowboy Like Me",
                "Long Story Short", "Marjorie", "Closure", "Evermore"));

        ArrayList<String> cancionesAlbum10 = new ArrayList<>();
        cancionesAlbum10.addAll(Arrays.asList("Lavender Haze", "Maroon", "Anti-Hero", "Snow on the Beach",
                "You're on Your Own, Kid", "Midnight Rain", "Question...?", "Vigilante Shit", "Bejeweled", "Labyrinth",
                "Karma", "Sweet Nothing", "Mastermind"));

        // Inicializar cada álbum y asignarle su set de canciones
        Album album1 = new Album("Taylor Swift", 2006, cancionesAlbum1);
        Album album2 = new Album("Fearless", 2008, cancionesAlbum2);
        Album album3 = new Album("Speak Now", 2010, cancionesAlbum3);
        Album album4 = new Album("Red", 2012, cancionesAlbum4);
        Album album5 = new Album("1989", 2014, cancionesAlbum5);
        Album album6 = new Album("Reputation", 2017, cancionesAlbum6);
        Album album7 = new Album("Lover", 2019, cancionesAlbum7);
        Album album8 = new Album("Folklore", 2020, cancionesAlbum8);
        Album album9 = new Album("Evermore", 2020, cancionesAlbum9);
        Album album10 = new Album("Midnights", 2022, cancionesAlbum10);
        // Crear lista con todos los álbumes
        ArrayList<Album> discografia = new ArrayList<>();
        discografia.add(album1);
        discografia.add(album2);
        discografia.add(album3);
        discografia.add(album4);
        discografia.add(album5);
        discografia.add(album6);
        discografia.add(album7);
        discografia.add(album8);
        discografia.add(album9);
        discografia.add(album10);

        // Retornar la lista de álbumes
        return discografia;
    }
}
