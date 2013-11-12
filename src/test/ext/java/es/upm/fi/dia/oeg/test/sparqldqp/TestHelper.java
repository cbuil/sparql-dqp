//Copyright (c) The University of Edinburgh, 2006-2009.
//
//LICENCE-START
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software 
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//LICENCE-END

package es.upm.fi.dia.oeg.test.sparqldqp;

import java.io.File;
import java.net.URL;

import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.util.DOTFileGenerator;

/**
 * Provides test properties for unit tests.
 * 
 * @author The OGSA-DAI Project Team.
 */
public class TestHelper
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) The University of Edinburgh, 2006-2009.";

    /**
     * Helper method which gets a file from a class's directory, using the
     * current class loader.
     * 
     * @param clazz
     *            Class.
     * @param fileName
     *            Name of file.
     * @return file object or <code>null</code> if none.
     */
    public static File getFileFromClassName(Class clazz, String fileName)
    {
        URL url = clazz.getResource(fileName);
        File file = null;
        if (url != null)
        {
            file = new File(url.getFile());
        }
        return file;
    }

    /**
     * Helper method which gets a file using the current class loader.
     * 
     * @param clazz
     *            Class.
     * @param fileName
     *            Name of file.
     * @return file object or <code>null</code> if none.
     */
    public static File getFileFromClassLoader(String fileName)
    {
        URL url = Thread.currentThread().getContextClassLoader()
                .getResource(fileName);
        File file = null;
        if (url != null)
        {
            file = new File(url.getFile());
        }
        return file;
    }

    /**
     * Helper method which gets a file using tthe file name.
     * 
     * @param fileName
     *            Name of file.
     * @return file object or <code>null</code> if none.
     */
    public static File getFileFromFileName(String fileName)
    {
        // URL url = Thread.currentThread().getContextClassLoader()
        // .getResource("DataNodeFactory.class");
        File file = null;
        if (fileName != null)
        {
            file = new File(fileName);
        }
        return file;
    }

    /**
     * Create a sub-directory in Java's temporary directory.
     * 
     * @param dirName
     *            Sub-directory name.
     * @return reference to new directory.
     */
    public static File createTemporaryDirectory(String dirName)
    {
        String tmpDir = System.getProperty("java.io.tmpdir");
        File dir = new File(tmpDir, dirName);
        dir.mkdir();
        return dir;
    }

    /**
     * Write to the query plan to file and generates a graphical representation
     * which is saved as a png file (with queryID as a file name prefix) in the
     * output directory.
     * 
     * @param lqpRoot
     *            query plan
     * @param queryID
     *            ID used to label the file
     * @param query
     *            query generated the plan
     * 
     * @throws Exception
     *             if any error occurs
     */
    public static void writeFile(Operator lqpRoot, String queryID, String query,
            String out_dir, String dotPath) throws Exception
    {
        File dotFile = File.createTempFile("temp", "dot");
        final File pngFile = new File(out_dir, queryID + ".pdf");

        String command = dotPath + " -Tpdf -q " + dotFile.getAbsolutePath()
                + " -o " + pngFile.getAbsolutePath();
        DOTFileGenerator dotGenerator = new DOTFileGenerator();
        dotGenerator.writeDotToFileAndRunCommand(lqpRoot, true, null,
                dotFile.getAbsolutePath(), command);
    }
}
