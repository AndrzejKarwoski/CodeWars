package pl.andrzejkarwoski;



/*
You probably know the "like" system from Facebook and other pages.
People can "like" blog posts, pictures or other items.
We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array,
containing the names of people who like an item. It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
For 4 or more names, the number in and 2 others simply increases.
*/


public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        if(names.length > 3){
            StringBuilder sb = new StringBuilder();
            return sb.append(names[0])
                    .append(", ")
                    .append(names[1])
                    .append(" and ")
                    .append(names.length-2)
                    .append(" others like this").toString();
        }
        else if(names.length == 3){
            StringBuilder sb = new StringBuilder();
            return sb.append(names[0])
                    .append(", ")
                    .append(names[1])
                    .append(" and ")
                    .append(names[2])
                    .append(" like this").toString();
        }
        else if(names.length == 2){
            StringBuilder sb = new StringBuilder();
            return sb.append(names[0])
                    .append(" and ")
                    .append(names[1])
                    .append(" like this").toString();
        }
        else if(names.length == 1){
            StringBuilder sb = new StringBuilder();
            return sb.append(names[0])
                    .append(" likes this").toString();
        }
        else{
            return "no one likes this";
        }
    }


    public static void main(String[] args){
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Andrew"));
    }

}
