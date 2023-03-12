public class ProgressBar {
    private int progress;
    private int total;

    public ProgressBar(int total) {
        this.total = total;
    }

    public void updateProgress(int progress) {
        this.progress = progress;
        int percentComplete = (int) (progress * 100.0 / total);
        String bar = "[";
        int numEquals = (int) (percentComplete / 2.0);
        for (int i = 0; i < numEquals; i++) {
            bar += "=";
        }
        if (percentComplete % 2 != 0) {
            bar += ">";
        }
        for (int i = numEquals; i < 50; i++) {
            bar += " ";
        }
        bar += "] " + percentComplete + "%";
        System.out.print("\r" + bar);
        if (progress == total) {
            System.out.print("\n");
        }
    }
}
