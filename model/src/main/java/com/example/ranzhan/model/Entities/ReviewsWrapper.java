/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.ranzhan.model.entities;


import java.util.List;

// TODO Use a common wrapper with Reviews and Movies
public class ReviewsWrapper {

    private String id;
    private String page;
    private List<Review> results;
    private Number total_pages;
    private Number total_results;

    public String getId() {

        return id;
    }

    public String getPage() {

        return page;
    }

    public List<Review> getResults() {

        return results;
    }

    public Number getTotal_pages() {

        return total_pages;
    }

    public Number getTotal_results() {

        return total_results;
    }
}