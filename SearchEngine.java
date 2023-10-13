import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class WebPage {
    private String url;
    private String title;
    public WebPage(String url,String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl(){
        return url;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title +"\nURL:" + url;
    }
}


public class SearchEngine {
    private List<WebPage> webPages;
    private List<String> searchHistory;

    public SearchEngine() {
        webPages = new ArrayList<>();


        webPages.add(new WebPage("https://www.example.com","Example Website"));
        webPages.add(new WebPage("https://www.sample.com","Sample site"));
        webPages.add(new WebPage("https://www.demo.com","Demo Webpage"));

        searchHistory = new ArrayList<>();
    
    }

    public void search(String keyword) {
        searchHistory.add(keyword);

        List<WebPage> results = new ArrayList<>();
        for (WebPage page : webPages) {
            if (page.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(page);
            }
        }
        System.out.println("Search results for '" + keyword + "':");
        for(int i=0;i<Math.min(results.size(),30);i++) {
            System.out.println("Result" + (i+1));
            System.out.println(results.get(i));
            System.out.println();
        }
    }


    public void displaySearchHistory() {
         System.out.println("Search History:");
         for (String keyword : searchHistory) {
            System.out.println(keyword);
         }
    }

    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        Scanner scanner = new Scanner(System.in);

        while(true) {
         System.out.println("Search Engine");
         System.out.println("1. Search");
         System.out.println("2. View Search History:");
         System.out.println("3. Exit:");
         System.out.println("Enter Your Choice:"); 
         int choice = scanner.nextInt();
         scanner.nextLine();
         
         
         switch (choice) {
            case 1:
            System.out.println("Enter a heyword to search:"); 
            String keyword = scanner.nextLine();
            searchEngine.search(keyword);
            break;
            case 2:
            searchEngine.displaySearchHistory();
            break;
            case 3:
            System.out.println("Exiting the search engine. Goodbye!");
            scanner.close();
            System.exit(0);
            default:
            System.out.println("Invalid choice.please try again.");
            break;  
         }
        }
    }
}
