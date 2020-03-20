package com.company;

/**
 * Concrete factory of "Data Base" entities' group.
 * Extends abstract factory of Readers and Writers (WebService).
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see WebService
 * @since 20.03.2020
 */
public class DBWebService extends WebService {
    /**
     * Creates instance of Data Base Reader.
     *
     * @return created instance.
     * @see DBReader
     */
    @Override
    public DBReader createReader() {
        return new DBReader();
    }

    /**
     * Creates instance of Data Base Writer.
     *
     * @return created instance.
     * @see DBWriter
     */
    @Override
    public DBWriter createWriter() {
        return new DBWriter();
    }
}
