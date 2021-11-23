/********************************************************************
 * Programmer:	sveinson
 * Class:  CS30S
 *
 * Assignment: AxQy
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    private String name;
    private String className;
    private String assignment;
    private String banner;
    private String closingMsg = "end of processing";
    
    private String nl = System.lineSeparator();
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    public ProgramInfo() {
        this.name = "Unkown";
        this.className = "Unkown";
        this.assignment = "Example 0";
    }
    
    public ProgramInfo(String name, String className, String assignment) {
        this.name = name;
        this.className = className;
        this.assignment = assignment;
    }
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    /*****************************************
    * Description:  get name
    * 
    * @return       name
    * ****************************************/
    public String getName() {
        return this.name;
    }// end getName
    
    /*****************************************
    * Description:  get class name
    * 
    * @return       class name
    * ****************************************/
    public String getClassName() {
        return this.className;
    }// end getClassName
    
    /*****************************************
    * Description:  get assignment name
    * 
    * @return       assignment name
    * ****************************************/
    public String getAssignment() {
        return this.assignment;
    }// end getAssignment
    
    /*****************************************
    * Description:  get banner
    * 
    * @return       banner
    * ****************************************/
    public String getBanner() {
        this.banner  = "*****************************" + nl;
        this.banner += "Name:        " + this.name + nl;
        this.banner += "Class:       " + this.className + nl;
        this.banner += "Assignment:  " + this.assignment + nl;
        this.banner += "*****************************" + nl + nl;
        return this.banner;
    }// end getBanner
    
    /*****************************************
    * Description:  get closing message
    * 
    * @return       closing message
    * ****************************************/
    public String getClosingMsg() {
        return this.closingMsg;
    }// end getClosingMsg
    
    //*** Setters ***
    /*****************************************
    * Description:  set name
    * 
    * @param        name to set
    * ****************************************/
    public void setName(String name) {
        this.name = name;
    }// end setName
    
    /*****************************************
    * Description:  set class name
    * 
    * @param        class name to set
    * ****************************************/
    public void setClassName(String className) {
        this.className = className;
    }// end setClassName
    
    /*****************************************
    * Description:  set assignment name
    * 
    * @param        assignment name to set
    * ****************************************/
    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }// end setAssignment
    
    //*** Other ***
    /*****************************************
    * Description:  print banner
    * 
    * Interface:
    * ****************************************/
    public void printBanner() {
        this.banner  = "*****************************" + nl;
        this.banner += "Name:        " + this.name + nl;
        this.banner += "Class:       " + this.className + nl;
        this.banner += "Assignment:  " + this.assignment + nl;
        this.banner += "*****************************" + nl + nl;
        System.out.println(this.banner);
    }// end printBanner
    
    /*****************************************
    * Description:  print closing message
    * 
    * Interface:
    * ****************************************/
    public void printClosingMsg() {
        System.out.println(this.closingMsg);
    }// end printClosingMsg
    
} // end of public class
