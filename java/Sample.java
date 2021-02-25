class Sample {
    public static void main(String[] args) {
        int i = 0;
        if (i == i) {
            return;
        }
        logger.info("Hello" + ", " + "world!");
        logger.info("Hello" + ", " + "world!");
    }

    private void call() {
        logger.info("Hello" + ", " + "world!");
        Arrays.asList("a").forEach(s -> logger.info(s));
    }
}