public class PhraseOMatic {
    public static void main(String args[])
    {
        String[] wordListOne = {"agnostic","opinionated","voice activate","haptically driven",
                                "extensible","reactive","agent based","functional", "AI enabled",
                                "strongy typed"};

        String[] wordListTwo = {"loosely coupled","six sigma","asynchronouse","event-driven","pub-sub",
                                "IoT","cloud active","service oriented","containerized","serverless",
                                "microservices","distributed ledge"};

        String[] wordListThree = {"framework","library","DSL","Rest API","repository","pipeline",
                                  "service mesh","architecture","perspective","design","orientation"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
