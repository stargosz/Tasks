public abstract class JavaTask{
    public static void main(String[] args) {
        int TitlesLength, i;
        TitlesLength = TitlesList.titles.length;

        for (i = 0; i < TitlesLength; i++) {
            System.out.println("Should we cast " + ActorsList.actors[i]+ " in "+ TitlesList.titles[i]+" and make it a "+ CategoriesList.category[i]+ " movie?");
        }
    }
}





