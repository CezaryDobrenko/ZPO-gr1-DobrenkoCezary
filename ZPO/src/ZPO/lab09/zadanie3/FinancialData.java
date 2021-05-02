package ZPO.lab09.zadanie3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class FinancialData {

    private static final Map<String, Period> periods;

    private final String name;

    static {
        periods = new ConcurrentHashMap<>();
        try {
            String path = FinancialData.class.getResource("data.txt").toString().substring(6);
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                String[] pair = line.split(":");
                periods.put(pair[0], new Period(Double.parseDouble(pair[1])));
            }
        } catch (IOException e) {
            System.out.println("scanner error");
            e.printStackTrace();
        }
    }

    private FinancialData(String name) {
        this.name = name;
    }

    public static Period getInstance(String name) {
        return periods.get(name);
    }

    public String getValue() {
        return name;
    }
}

