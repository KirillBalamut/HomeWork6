package org.example;

public class Main {
    /**
     * Класс документ - описывает структуру документа.
     */
    static class Document {
        private long id;
        private String number;
        // ...

        public Document(long id, String number) {
            this.id = id;
            this.number = number;
        }

        // Геттеры и сеттеры для полей документа
    }

    /**
     * Сервис отчетов - формирует отчеты для документа.
     */
    static class ReportService {
        public byte[] createReport(Document document, String reportType) {
            switch (reportType) {
                case "pdf-1":
                    return createPdfReport1(document);
                case "json":
                    return createJsonReport(document);
                case "xml":
                    return createXmlReport(document);
                // Добавление новых типов отчетов
                case "csv":
                    return createCsvReport(document);
                default:
                    throw new UnsupportedOperationException("Unsupported report type: " + reportType);
            }
        }

        private byte[] createPdfReport1(Document document) {
            // Логика формирования PDF-отчета типа 1
            return new byte[0];
        }

        private byte[] createJsonReport(Document document) {
            // Логика формирования JSON-отчета
            return new byte[0];
        }

        private byte[] createXmlReport(Document document) {
            // Логика формирования XML-отчета
            return new byte[0];
        }

        // Методы для формирования других типов отчетов
        private byte[] createCsvReport(Document document) {
            // Логика формирования CSV-отчета
            return new byte[0];
        }
    }

    public static void main(String[] args) {
        Document document = new Document(1, "DOC-001");

        ReportService reportService = new ReportService();
        byte[] pdfReport = reportService.createReport(document, "pdf-1");
        byte[] jsonReport = reportService.createReport(document, "json");
        byte[] xmlReport = reportService.createReport(document, "xml");
        // Формирование других типов отчетов
        byte[] csvReport = reportService.createReport(document, "csv");

        // Дальнейшая обработка сформированных отчетов
    }
}