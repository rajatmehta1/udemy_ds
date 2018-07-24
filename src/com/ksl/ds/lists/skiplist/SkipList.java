package com.ksl.ds.lists.skiplist;

/*
 * One of the popular interview questions in google
 *
 * Its like a list with a fast lane concept
 *
 *  arr -> { 2, 4, 6, 8, 10, 13,14,18,19,23, 45, 67, 80, 90, 100}
 *
 *    Finding 23...
 *   (last list - 3) ->     { 10,80 } ---> 23
 *   (last list - 2) ->     { 2, 10, 19, 80 }
 *   (last list - 1) ->     { 2, 6, 10, 14, 19, 45, 80, 100 }
 *    last list ->          { 2, 4, 6, 8, 10, 13, 14, 18, 19, 23, 45, 67, 80, 90, 100 }
 *
 *    For those of you who don’t know, a linked list is a collection
 *    of objects which are linked together by one “node” pointing to the next one in the chain.
 */
public class SkipList {
}
