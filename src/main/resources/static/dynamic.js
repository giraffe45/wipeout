const app = Vue.createApp({
    data() {
        return {
            currentTab: 'Home',
            tabs: ['Home', 'Surfspots', 'About']
        }
    },
    computed: {
        currentTabComponent() {
            return 'tab-' + this.currentTab.toLowerCase()
        }
    }
})

app.component('tab-home', {
    template: `<div class="demo-tab">Welcome to the Waveguide!</div>`
})
app.component('tab-surfspots', {
    template: `<div class="demo-tab">Here you can find your Surfspots</div>`
})
app.component('tab-about', {
    template: `<div class="demo-tab">This is a dynamic vue example</div>`
})

app.mount('#dynamic-component-demo')