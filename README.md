# Assignment 2: Factory Method and Abstract Factory

**Student:** Aida Yerbulat  
**Course:** Software Design Patterns  
**Theme:** Report Export Studio

## Project Overview

In this project, I implemented two creational design patterns: Factory Method and Abstract Factory

The application works with different types of reports and export formats. Factory Method creates one report, while Abstract Factory creates a complete family of export components

## Project Structure

The project contains two packages

The `factorymethod` package contains the implementation of the Factory Method pattern. It includes the Report interface, three report classes, the abstract ReportCreator class, three concrete creators, and Main

The `abstractfactory` package contains the implementation of the Abstract Factory pattern. It includes interfaces for Header, TableSection, and Footer, as well as PDF, DOCX, and HTML product families. It also contains ExportFactory, three concrete factories, ExportApplication, and Main

## Part A: Factory Method

The Product interface is `Report`. It has two methods: `getTitle()` and `generateContent()`

I created three Concrete Products:

- SalesReport
- AuditReport
- SummaryReport

`ReportCreator` is the abstract Creator. It declares the factory method `createReport()` and contains the business method `prepareAndDisplayReport()`

I also created three Concrete Creators. Each creator returns a different report:

- SalesReportCreator creates SalesReport
- AuditReportCreator creates AuditReport
- SummaryReportCreator creates SummaryReport

The client works with ReportCreator and does not create concrete Report objects directly

## Part B: Abstract Factory

For this part, I created a family with three related products:

- Header
- TableSection
- Footer

The `ExportFactory` interface has one creation method for each product

There are three Concrete Factories:

- PdfExportFactory
- DocxExportFactory
- HtmlExportFactory

Each factory creates matching components. For example, PdfExportFactory creates PdfHeader, PdfTable, and PdfFooter

`ExportApplication` receives the factory through its constructor. It uses only interfaces and does not know the concrete product classes

The complete product family is selected in one place in `abstractfactory.Main`

## Difference Between the Patterns

Factory Method creates one product and mainly uses inheritance. In my project, the Creator subclasses decide which Report to create

Abstract Factory creates a family of related products and uses composition. In my project, ExportApplication receives a factory that creates a matching Header, TableSection, and Footer

## SOLID Principles

The project follows the Open Closed Principle because I can add a new report or export family without changing the main business logic

It also follows the Single Responsibility Principle because report classes generate report content, creator classes create reports, factories create product families, and ExportApplication uses the created products

The client classes depend on interfaces instead of concrete product classes

## Drawbacks

These patterns require many small classes and interfaces. They may be unnecessary when an application has only one simple product

A weak point of Abstract Factory is adding a new product type. For example, adding Chart would require changes to ExportFactory and every Concrete Factory

## How to Run

Run `factorymethod.Main` to test Factory Method

Run `abstractfactory.Main` to test Abstract Factory

The available program arguments for Abstract Factory are:
pdf
docx
html
