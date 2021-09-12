//Ameer Ahmed

public class DepartmentMain {
    public static void main (String [] args) {
        Student S1 = new Student("Luke", 21, "1HTE453TS", true, "123YY6",98.5, "A+");
        Student S2 = new Student("Bobby", 20, "45HRY45Y6S", true, "35GH75",91.3, "A-");
        Student S3 = new Student("Gon", 19, "798AXZD34MP", true, "642YSQ9",89.3, "B+");
        Student S4 = new Student("Goku", 18, "23HCVB65MN", true, "456JHPT",84.7, "B");
        Student S5 = new Student("Gohan", 22, "P08426MAZX", true, "980DDGS",96.1, "A");
        Student S6 = new Student("Tony", 19, "5HVCS890TKM", true, "321VBCM2",99.5, "A+");

        Student [] Roster1 = new Student[6];
        Roster1 [0] = S1;
        Roster1 [1] = S2;
        Roster1 [2] = S3;
        Roster1 [3] = S4;
        Roster1 [4] = S5;
        Roster1 [5] = S6;

        Teacher T1 = new Teacher("Dr. Li", 30, "THKH23586", true, "1276HTP", 60000, 3);
        Teacher T2 = new Teacher("Mrs. Tsukimi", 26, "HFVG5332", true, "3890PIY", 100000, 5);
        Teacher T3 = new Teacher("Mr. Leonard ", 32, "MZXF67890", true, "9067ASR", 70000, 4);
        Teacher T4 = new Teacher("Mrs. Domokos", 28, "ZXCBR2579", true, "4579GHZ", 80000, 2);

        Teacher [] Roster2 = new Teacher[4];
        Roster2 [0] = T1;
        Roster2 [1] = T2;
        Roster2 [2] = T3;
        Roster2 [3] = T4;

        Department DepartmentObject1 = new Department("Math", 8, Roster2, Roster1);

        System.out.println(DepartmentObject1.toString());

        //2nd department
        Student S7 = new Student("Annie", 21, "1HTE453TS", true, "123YY6",98.5, "A-");
        Student S8 = new Student("Brenda", 20, "45HRY45Y6S", true, "35GH75",91.3, "A+");
        Student S9 = new Student("Christina", 19, "798AXZD34MP", true, "642YSQ9",89.3, "B-");
        Student S10 = new Student("Houki", 18, "23HCVB65MN", true, "456JHPT",84.7, "B");
        Student S11 = new Student("Ichika", 22, "P08426MAZX", true, "980DDGS",96.1, "A");
        Student S12 = new Student("Cecilia", 19, "5HVCS890TKM", true, "321VBCM2",99.5, "B+");

        Student [] Roster3 = new Student[6];
        Roster3 [0] = S7;
        Roster3 [1] = S8;
        Roster3 [2] = S9;
        Roster3 [3] = S10;
        Roster3 [4] = S11;
        Roster3 [5] = S12;

        Teacher T5 = new Teacher("Dr. Tabane", 29, "THKH23586", true, "1276HTP", 50000, 5);
        Teacher T6 = new Teacher("Mrs. Usami", 25, "HFVG5332", true, "3890PIY", 90000, 9);
        Teacher T7 = new Teacher("Mr. Allmight ", 30, "MZXF67890", true, "9067ASR", 60000, 2);
        Teacher T8 = new Teacher("Mrs. Kawakami", 35, "ZXCBR2579", true, "4579GHZ", 40000, 4);

        Teacher [] Roster4 = new Teacher[4];
        Roster4 [0] = T5;
        Roster4 [1] = T6;
        Roster4 [2] = T7;
        Roster4 [3] = T8;

        Department DepartmentObject2 = new Department("Science", 10, Roster4, Roster3);

        System.out.println(DepartmentObject2.toString());
    }
}