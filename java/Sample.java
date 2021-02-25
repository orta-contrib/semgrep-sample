class Sample {
    public static void main(String[] args) {
        logger.info("Hello" + ", " + "world!");
        logger.info("Hello" + ", " + "world!");
    }

    private void call() {
        logger.info("Hello" + ", " + "world!");
        Arrays.asList("a").forEach(s -> logger.info(s));
    }
}