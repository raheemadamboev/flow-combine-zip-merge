# flow-combine-zip-merge

<img align="right" width="296" height="600"  src="https://github.com/raheemadamboev/flow-combine-zip-merge/blob/master/banner.gif" />

Basic app to show case combine, zip, merge flow transform functions

**Flow Combine Zip Merge**

<a href="https://github.com/raheemadamboev/flow-combine-zip-merge/blob/master/app-debug.apk">Download demo</a>

**combine()**

Returns a Flow whose values are generated with transform function by combining the most recently emitted values by each flow. Everytime one of the provided flows change it fires up the transform block, so we can return desired data with latest values.

**zip()**

Zips values from the current flow (this) with other flow using provided transform function applied to each pair of values. The resulting flow completes as soon as one of the flows completes and cancel is called on the remaining flow.

**merge()**

Merges the given flows into a single flow without preserving an order of elements. All flows are merged concurrently, without limit on the number of simultaneously collected flows.
