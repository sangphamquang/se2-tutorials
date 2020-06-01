package tut09se2.factory;

// Create the Admission class to generate object of sub-classes
class Admission {

    // use admittingCourse method to get object of type Course

    public Course admittingCourse(String courseName) {
        //TO-DO: if courseName is null => return null
        if (courseName == null) {
            return null;
        }
        //TO-DO: if courseName is similar to 1 of 3 sub-class's name => return corresponding objects
        if (courseName.equalsIgnoreCase("Computer")) {
            return new Computer();
        }
        if (courseName.equalsIgnoreCase("Health")) {
            return new Health();
        }
        if (courseName.equalsIgnoreCase("CivilService")) {
            return new CivilService();
        }
        //TO-DO: return null for default
        return null;
    }
}
