/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package twitter4j.api;

/**
 * @author Joern Huxhorn - jhuxhorn at googlemail.com
 */
public interface FavoriteMethodsAsync {
    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls http://api.twitter.com/1/favorites
     *
     * @see <a href="http://dev.twitter.com/doc/get/favorites">GET favorites | dev.twitter.com</a>
     * @since Twitter4J 2.0.1
     */
    void getFavorites();

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls http://api.twitter.com/1/favorites
     *
     * @param page number of page to retrieve favorites
     * @see <a href="http://dev.twitter.com/doc/get/favorites">GET favorites | dev.twitter.com</a>
     * @since Twitter4J 2.0.1
     */
    void getFavorites(int page);

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls http://api.twitter.com/1/favorites
     *
     * @param id the ID or screen name of the user for whom to request a list of favorite statuses
     * @see <a href="http://dev.twitter.com/doc/get/favorites">GET favorites | dev.twitter.com</a>
     * @since Twitter4J 2.0.1
     */
    void getFavorites(String id);

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls http://api.twitter.com/1/favorites
     *
     * @param id   the ID or screen name of the user for whom to request a list of favorite statuses.
     * @param page retrieves the 20 next most recent favorite statuses.
     * @see <a href="http://dev.twitter.com/doc/get/favorites">GET favorites | dev.twitter.com</a>
     * @since Twitter4J 2.0.1
     */
    void getFavorites(String id, int page);

    /**
     * Favorites the status specified in the ID parameter as the authenticating user.  Returns the favorite status when successful.
     * <br>This method calls http://api.twitter.com/1/favorites/create%C2%A0
     *
     * @param id the ID or screen name of the user for whom to request a list of favorite statuses.
     * @see <a href="http://dev.twitter.com/doc/post/favorites/create/:id">POST favorites/create/:id | dev.twitter.com</a>
     * @since 1.1.2
     */
    void createFavorite(long id);

    /**
     * Favorites the status specified in the ID parameter as the authenticating user.  Returns the favorite status when successful.
     * <br>This method calls http://api.twitter.com/1/favorites/destroy
     *
     * @param id the ID or screen name of the user for whom to request a list of un-favorite statuses.
     * @see <a href="http://dev.twitter.com/doc/post/favorites/destroy/:id">POST favorites/destroy/:id | dev.twitter.com</a>
     * @since 1.1.2
     */
    void destroyFavorite(long id);
}
