public class MainBruteHeap {
    public static void main(String[] args) {
        int sz = 3;
        if (args.length > 0) {
            try {
                sz = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao interpretar o tamanho da permutação, usando valor padrão.");
            }
        }

        int[] p = new int[sz];
        for (int i = 0; i < sz; i++) {
            p[i] = i + 1;
        }

        long totalTime = 0;
        int executions = 6;
        for (int i = 0; i < executions; i++) {
            long startTime = System.nanoTime();
            Permutation.func_permHeap(sz, p, sz);
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }

        double averageTime = (totalTime / 1e6) / executions;

        System.out.printf("Tempo médio de execução: %.3f ms%n", averageTime);
    }
}
