package com.polarbookshop.orderservice.book;

/**
 * The Book record is a DTO to store book information.
 *
 * @param isbn
 * @param title
 * @param author
 * @param price
 */
public record Book(
  String isbn,
  String title,
  String author,
  Double price
) {}
