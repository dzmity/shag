package by.shag.lesson27.savostyanchik;

public class RepositoryThread {
    private static int resultsThreads;


    public int getResultsThreads() {
        return resultsThreads;
    }

    public void setResultsThreads(int resultsThreads) {
        RepositoryThread.resultsThreads += resultsThreads;
    }
}
