export default {
    props: ['title'],
    template: `
    <div>
      <input v-model="nameField" placeholder="Name" type="text" ref="nameInput">
      <input v-model="addressField" placeholder="Address" @keyup.enter="save()">
      <button type="button" @click="save()">Save</button>
    </div>
    <div>
      <h3> {{ title }} </h3>
        <table>
          <thead>
          <tr>
            <th>Name</th>
            <th>Address</th>
          </tr>
          </thead>
          <tbody>
          <tr v-if="items.length === 0">
            <td colspan="2">No surfspots yet</td>
          </tr>
          <tr v-for="surfspot in items">
            <td>{{surfspot.name}}</td>
            <td>{{surfspot.price}}</td>
          </tr>
          <tr>
            <td>{{ nameField }}</td>
            <td>{{ addressField }}</td>
          </tr>
          </tbody>
        </table>
    </div>
  `,
    data() {
        return {
            items: [],
            nameField: '',
            addressField: '',
        };
    },
    methods: {
        loadProducts() {
            axios
                .get('/surfspots')
                .then(response => (this.items = response.data))
        },
        save() {
            axios
                .post('/surfspots', {
                    name: this.nameField,
                    price: this.addressField
                })
                .then((response) => {
                    this.nameField = '';
                    this.addressField = '';
                    this.$refs.nameInput.focus();
                    this.loadProducts();
                }, (error) => {
                    console.log('Could not save surfspot!');
                });
        },
    },
    mounted: function() {
        this.loadProducts();
    }
}