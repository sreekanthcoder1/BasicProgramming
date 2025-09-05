public class PracticeProgram {
    public static void main(String[] args) {

        // Create a String Array
        String[][] subjects = {
                // Row 1
                {"Data Structures & Algorithms",
                        "Programming & Logic",
                        "Software Engineering",
                        "Theory of Computation"},

                // Row 2
                {"Thermodynamics",
                        "Metallurgy",
                        "Machine Drawing",
                        "Fluid Mechanics"},

                // Row 3
                {"Signals and Systems",
                        "Digital Electronics",
                        "Power Electronics"}
        };
        System.out.println(subjects[0][1]);
        System.out.println(subjects[1][2]);
        System.out.println(subjects[2][1]);
    }
}
