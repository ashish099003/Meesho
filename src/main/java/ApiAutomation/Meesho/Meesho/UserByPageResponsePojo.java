package ApiAutomation.Meesho.Meesho;

import java.util.ArrayList;

public class UserByPageResponsePojo {
    private Data data;
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    

    public Data getData() {
        return data;
    }

    public int getpage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public int total() {
        return total;
    }
    
    public int total_Pages() {
        return total_pages;
    }
 

    public class Data {
        private int id;  
        private String email;       
        private String first_Name;
        private String last_Name;
        private String avatar;
        
        public int getId() {
            return id;
        }
       
        public String getEmail() {
            return email;
        }
      
        public String getFirst_Name() {
            return first_Name;
        }

        public String getLast_Name() {
            return last_Name;
        }

        public String getAvatar() {
            return avatar;
        }
       
    }
    
}
