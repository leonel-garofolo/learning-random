package com.patterns.solid.srp;

final class PageBookPrinter
{
    private final Book book;
    public PageBookPrinter() {
        this.book = new Book();
    }

    public void printPage(){
        String currentPage = book.getCurrentPage();
        StandardOutputPrinter printer = new StandardOutputPrinter();
        printer.printPage(currentPage);
    }
}