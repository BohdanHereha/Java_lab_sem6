package com.company;

/**
 * Concrete factory of "File" entities' group.
 * Extends abstract factory of Readers and Writers (WebService).
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see WebService
 * @since 20.03.2020
 */
public class FileWebService extends WebService {
    /**
     * Creates instance of File Reader.
     *
     * @return created instance.
     * @see FileReader
     */
    @Override
    public FileReader createReader() {
        return new FileReader();
    }

    /**
     * Creates instance of File Writer.
     *
     * @return created instance.
     * @see FileWriter
     */
    @Override
    public FileWriter createWriter() {
        return new FileWriter();
    }
}
