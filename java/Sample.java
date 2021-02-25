class Sample {
    public static void main(String[] args) {
        int i = 0;
        if (i == i) {
            return;
        }
        System.out.println("Hello" + ", " + "world!");
        System.out.println("Hello" + ", " + "world!");
    }

    private void call() {
        System.out.println("Hello" + ", " + "world!");
        Arrays.asList("a").forEach(s -> System.out.println(s));
    }
}