package net.thunderbird.core.common.resources

// TODO: Add support for Multiplatform resources. See https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-resources.html
interface StringsResourceManager {
    /**
     * Return the string value associated with a particular resource ID.  It
     * will be stripped of any styled text information.
     *
     * @param resourceId The desired resource identifier, as generated by the aapt tool.
     * This integer encodes the package, type, and resource entry. The value 0 is an
     * invalid identifier.
     * @throws net.thunderbird.core.common.resources.ResourceNotFoundException Throws NotFoundException if the given ID
     * does not exist.
     * @return String The string data associated with the resource, stripped of styled
     * text information.
     */
    fun stringResource(@StringRes resourceId: Int): String

    /**
     * Return the string value associated with a particular resource ID,
     * substituting the format arguments as defined in {@link java.util.Formatter}
     * and {@link java.lang.String#format}. It will be stripped of any styled text
     * information.
     *
     * @param resourceId The desired resource identifier, as generated by the aapt tool.
     * This integer encodes the package, type, and resource entry. The value 0 is an invalid
     * identifier.
     * @param formatArgs The format arguments that will be used for substitution.
     * @throws net.thunderbird.core.common.resources.ResourceNotFoundException Throws NotFoundException if the given ID
     * does not exist.
     * @return String The string data associated with the resource, stripped of styled text
     * information.
     */
    fun stringResource(@StringRes resourceId: Int, vararg formatArgs: Any?): String
}
